package com.company;

public class Main {

    public static void main(String[] args) {
        // Create a generic class to implement a league table for a sport.
        // The class should allow teams to be added to the list, and store
        // a list of teams that belong to the league.
        //
        // Your class should have a method to print out the teams in order,
        // with the team at the top of the league printed first.
        //
        // Only teams of the same type should be added to any particular
        // instance of the league class - the program should fail to compile
        // if an attempt is made to add an incompatible team.
        League<Team<FootballPlayer>> footballLeague =new League<>("AFL");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);
        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(hawthorn, 3, 8);
        footballLeague.showLeagueTable();
    }
}
