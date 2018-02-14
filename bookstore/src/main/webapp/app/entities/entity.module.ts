import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

import { JhipstermonolithAuthorModule } from './author/author.module';
import { JhipstermonolithBookModule } from './book/book.module';
/* jhipster-needle-add-entity-module-import - JHipster will add entity modules imports here */

@NgModule({
    imports: [
        JhipstermonolithAuthorModule,
        JhipstermonolithBookModule,
        /* jhipster-needle-add-entity-module - JHipster will add entity modules here */
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class JhipstermonolithEntityModule {}
