import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddPlayerComponent } from './components/add-player/add-player.component';
import { DisplayPlayerComponent } from './components/display-player/display-player.component';
import { UpdatePlayerComponent } from './components/update-player/update-player.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { DashBoardComponent } from './components/dash-board/dash-board.component';
import { PlayersService } from './service/player.service';
import { SearchComponent } from './components/search/search.component';

@NgModule({
  declarations: [
    AppComponent,
    AddPlayerComponent,
    DisplayPlayerComponent,
    UpdatePlayerComponent,
    DashBoardComponent,
    SearchComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule

  ],
  providers: [PlayersService],
  bootstrap: [AppComponent]
})
export class AppModule { }
