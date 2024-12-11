export enum Role {
		
    BATSMAN, BOWLER , KEEPER, ALLROUNDER
}
export class Player
{
    playerId:number=0;
    playerName:string='';
    jerseyNumber:string='';
    roles:Role | null = null;
    totalMatches:number=0;
    teamName:string='';
    country:string='';
    description:string='';
}