import { Component, OnInit } from '@angular/core';
import { Role, Player } from 'src/app/model/player';
import { PlayersService } from 'src/app/service/player.service';

@Component({
  selector: 'app-add-player',
  templateUrl: './add-player.component.html',
  styleUrls: ['./add-player.component.css']
})
export class AddPlayerComponent   {
  


  roles = Object.values(Role); 

  constructor(private  service:PlayersService){

  }
 
   

    

  addPlayer(player:Player){

            this.service.addPlayer(player).subscribe(

                (response)=>{  console.log(response)

                  alert(response.playerId +" Player added successfully")
                } ,

                (err)=>{ console.log(err)}



            );
}
}
