import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Player } from 'src/app/model/player';
import { PlayersService } from 'src/app/service/player.service';

@Component({
  selector: 'app-dash-board',
  templateUrl: './dash-board.component.html',
  styleUrls: ['./dash-board.component.css']
})
export class DashBoardComponent {

  data:string = '';

    constructor(private userService:PlayersService,private router:Router){}
   
      find(searchData:any){

          this.router.navigate(['/search/'+searchData.form.value.data])

          console.log(searchData.form.value.data);
          

      }


}
