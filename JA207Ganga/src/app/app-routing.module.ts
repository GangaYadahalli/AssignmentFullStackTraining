import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashBoardComponent } from './components/dash-board/dash-board.component';
import { AddPlayerComponent } from './components/add-player/add-player.component';
import { DisplayPlayerComponent } from './components/display-player/display-player.component';
import { UpdatePlayerComponent } from './components/update-player/update-player.component';
import { SearchComponent } from './components/search/search.component';

const routes: Routes = [

  {path:'home',component:DashBoardComponent},
  {path:'addPlayer',component:AddPlayerComponent},
  {path:'displayall',component:DisplayPlayerComponent},
  {path:'updatePlayer',component:UpdatePlayerComponent},
  {path:'search/:input',component:SearchComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
