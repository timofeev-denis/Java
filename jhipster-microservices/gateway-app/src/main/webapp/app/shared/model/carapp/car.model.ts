export interface ICar {
    id?: number;
    make?: string;
    model?: string;
    price?: string;
}

export class Car implements ICar {
    constructor(public id?: number, public make?: string, public model?: string, public price?: string) {}
}
