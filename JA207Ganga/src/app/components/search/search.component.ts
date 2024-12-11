import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Player } from 'src/app/model/player';
import { PlayersService } from 'src/app/service/player.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent {
  playerList:Player[] =[];

  constructor(private route:ActivatedRoute, private service:PlayersService){}

  ngOnInit(): void {
   
    this.find();
}
 
   searchInput:string = '';

  find(){

       

      this.route.params.subscribe( (param)=>{ this.searchInput = param['input']});

      this.service.find(this.searchInput).subscribe( (list)=> {this.playerList = list;console.log('list '+list)});
     
      console.log('serached data '+this.playerList);

  }

  




}
