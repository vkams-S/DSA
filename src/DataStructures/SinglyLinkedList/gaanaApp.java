package DataStructures.SinglyLinkedList;

public class gaanaApp {
    public static void main(String[] args) {
      songs song1 = new songs("1.Pardeshi Jana Nhi","Raja Hindustani",5.0);
      songs song2 = new songs("2.Tu Pyar Hai Kisi Aur Ka","Dil Hai Ke Manta Nahin",7.0);
      songs song3 = new songs("3.Koi Fariyaad","Tum Bin",8.0);
      song1.next=song2;
      song2.next=song3;
      song3.next=song1;
      song1.prev=song3;
      song2.prev=song1;
      song3.prev=song2;
      songs song=song1; //reference copy
      while (true)
      {
          if(song.next==song1)
          {
              song.showSongs();
              break;
          }
          song.showSongs();
          song=song.next;

      }

    }
}

class songs{
    String track;
    String Movie;
    double duration;
    songs next;
    songs prev;
    public songs()
    {
        track="NA";
        Movie="NA";
        duration=0.0;
    }
    public songs(String track,String Movie,double duration)
    {
        this.track=track;
        this.Movie=Movie;
        this.duration=duration;
    }

    public void showSongs()
    {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(track+"\t\t"+Movie+"\t"+duration);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
