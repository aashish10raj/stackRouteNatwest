import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ComponentInteractionComponent } from './components/component-interaction/component-interaction.component';
import { ContactlistComponent } from './components/contactlist/contactlist.component';
import { PostsComponent } from './components/posts/posts.component';
import { ProfileComponent } from './components/profile/profile.component';
import { UserComponent } from './components/user/user.component';

const routes: Routes = [
  {
  path:'',
  pathMatch:'full',
  redirectTo:"contact"
},
{
  path:'contact',
  component:ContactlistComponent
},
{
  path:'interact',
  component:ComponentInteractionComponent
},
{
  path:'user',
  component:UserComponent
},
{path:'profile/:id',
component:ProfileComponent,
children:[{
  path:'posts',
  component:PostsComponent
}]
}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
