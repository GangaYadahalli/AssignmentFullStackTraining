import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Player } from "../model/player";
import { HttpClient } from "@angular/common/http";

@Injectable({
    providedIn: 'root'
  })

  export class PlayersService
  {
    baseURL:string = "http://localhost:8080/api/players/";

    constructor(private  http:HttpClient) {

    }
    addPlayer(player:Player):Observable<Player>{

        return  this.http.post<Player>(this.baseURL+"insert",player);

    }
    getAll():Observable<Player[]>{

        return  this.http.get<Player[]>(this.baseURL+"getAll");

    }
    delete(playerId:number):Observable<string>{

        return  this.http.delete<string>(this.baseURL+`deleteById/${playerId}`);
  
      }
    updatePlayerById(playerId: number, player: Player): Observable<Player> {
        return this.http.put<Player>(`${this.baseURL}update/${playerId}`, player);
    }
    

  }
