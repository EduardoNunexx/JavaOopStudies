package OopConcepts.Challenge02.ChallengeBlock18;

public class Date {
    int day;
    int year;
    String mounth;
    //setting the defaul set
    Date(){
        day=1;
        year=1;
        mounth="1";
    }
    //setting the new constructor
    Date(int d, int y, String m){
        day=d;
        year=y;
        mounth=m;
    }
}