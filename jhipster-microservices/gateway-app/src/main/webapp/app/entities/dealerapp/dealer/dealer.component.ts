import { Component, OnInit, OnDestroy } from '@angular/core';
import { HttpErrorResponse, HttpResponse } from '@angular/common/http';
import { Subscription } from 'rxjs';
import { JhiEventManager, JhiAlertService } from 'ng-jhipster';

import { IDealer } from 'app/shared/model/dealerapp/dealer.model';
import { AccountService } from 'app/core';
import { DealerService } from './dealer.service';

@Component({
    selector: 'jhi-dealer',
    templateUrl: './dealer.component.html'
})
export class DealerComponent implements OnInit, OnDestroy {
    dealers: IDealer[];
    currentAccount: any;
    eventSubscriber: Subscription;

    constructor(
        protected dealerService: DealerService,
        protected jhiAlertService: JhiAlertService,
        protected eventManager: JhiEventManager,
        protected accountService: AccountService
    ) {}

    loadAll() {
        this.dealerService.query().subscribe(
            (res: HttpResponse<IDealer[]>) => {
                this.dealers = res.body;
            },
            (res: HttpErrorResponse) => this.onError(res.message)
        );
    }

    ngOnInit() {
        this.loadAll();
        this.accountService.identity().then(account => {
            this.currentAccount = account;
        });
        this.registerChangeInDealers();
    }

    ngOnDestroy() {
        this.eventManager.destroy(this.eventSubscriber);
    }

    trackId(index: number, item: IDealer) {
        return item.id;
    }

    registerChangeInDealers() {
        this.eventSubscriber = this.eventManager.subscribe('dealerListModification', response => this.loadAll());
    }

    protected onError(errorMessage: string) {
        this.jhiAlertService.error(errorMessage, null, null);
    }
}
