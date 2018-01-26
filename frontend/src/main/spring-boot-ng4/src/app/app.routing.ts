import {NgModule} from '@angular/core';
import {RouterModule, PreloadAllModules} from '@angular/router';


import {MainComponent} from './main/main.component';
import{UserComponent} from './user/user.component';
import{ProductComponent} from './product/product.component';
import {CategoryComponent} from './category/category.component';


@NgModule({
  imports: [
    RouterModule.forRoot([
      {path: 'user', component: UserComponent},
      {path: 'product', component: ProductComponent},
      {path: 'category', component: CategoryComponent},
      {path: '', component: MainComponent}

    ], {preloadingStrategy: PreloadAllModules})
  ],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
