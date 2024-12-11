import { Component, OnInit } from '@angular/core';
import { Player } from 'src/app/model/player';
import { PlayersService } from 'src/app/service/player.service';

@Component({
  selector: 'app-display-player',
  templateUrl: './display-player.component.html',
  styleUrls: ['./display-player.component.css']
})
export class DisplayPlayerComponent implements OnInit {

  playerList:Player[] = [];

    constructor(private playerService:PlayersService){}


  ngOnInit(){

      this.getAllPlayers();

  }


  getAllPlayers(){
    
      this.playerService.getAll().subscribe( 
                                (list)=>{ this.playerList = list;  console.log(list)}
                                
                                  );

          

 }
 deleteById(playerId:number){

  this.playerService.delete(playerId).subscribe( (msg)=>{ console.log("Deleted "+msg);});


  this.getAllPlayers();

}


}
