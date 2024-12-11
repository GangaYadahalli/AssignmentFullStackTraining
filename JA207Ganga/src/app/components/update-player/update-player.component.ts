import { Component } from '@angular/core';
import { Role, Player } from 'src/app/model/player';
import { PlayersService } from 'src/app/service/player.service';

@Component({
  selector: 'app-update-player',
  templateUrl: './update-player.component.html',
  styleUrls: ['./update-player.component.css']
})
export class UpdatePlayerComponent {
  roles = Object.values(Role); 


  constructor(private  service:PlayersService){

  }

  updatePlayer(player: Player) {
    const playerId = player.playerId;
    this.service.updatePlayerById(playerId, player).subscribe(
        (response) => {
            console.log(response);
            alert(`Player ID ${response.playerId} updated successfully`);
        },
        (error) => {
            console.log(error);
            alert('Failed to update player');
        }
    );
  }

}
