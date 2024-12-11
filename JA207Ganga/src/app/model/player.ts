export enum Role {
		
    BATSMAN='BATSMAN',
    BOWLER='BOWLER' ,
    KEEPER='KEEPER' ,
    ALLROUNDER='ALLROUNDER' 
}
export interface Player
{
    playerId:number;
    playerName:string;
    jerseyNumber:string;
    roles: Role ;
    totalMatches:number;
    teamName:string;
    country:string;
    description:string;
}