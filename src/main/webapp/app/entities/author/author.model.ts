import { BaseEntity } from './../../shared';

export class Author implements BaseEntity {
    constructor(
        public id?: number,
        public firstName?: string,
        public lastName?: string,
        public about?: string,
        public books?: BaseEntity[],
    ) {
    }
}
