import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { GatewaySharedModule } from 'app/shared';
import {
    DealerComponent,
    DealerDetailComponent,
    DealerUpdateComponent,
    DealerDeletePopupComponent,
    DealerDeleteDialogComponent,
    dealerRoute,
    dealerPopupRoute
} from './';

const ENTITY_STATES = [...dealerRoute, ...dealerPopupRoute];

@NgModule({
    imports: [GatewaySharedModule, RouterModule.forChild(ENTITY_STATES)],
    declarations: [DealerComponent, DealerDetailComponent, DealerUpdateComponent, DealerDeleteDialogComponent, DealerDeletePopupComponent],
    entryComponents: [DealerComponent, DealerUpdateComponent, DealerDeleteDialogComponent, DealerDeletePopupComponent],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class GatewayDealerModule {}
