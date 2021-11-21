package AdapterPattern.Example;
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;
  
    public MediaAdapter(String audioType){
  
      // 생성 시, vlc 인지 mp4 인지 구분.
      if(audioType.equalsIgnoreCase("vlc") ){
        advancedMusicPlayer = new VlcPlayer();            
  
      }else if (audioType.equalsIgnoreCase("mp4")){
        advancedMusicPlayer = new Mp4Player();
      }    
    }
  
    @Override
    public void play(String audioType, String fileName) {
  
      // play 호출 시, 구체적인 각 플레이어의 메쏘드를 호출.
      if(audioType.equalsIgnoreCase("vlc")){
        advancedMusicPlayer.playVlc(fileName);
      }
      else if(audioType.equalsIgnoreCase("mp4")){
        advancedMusicPlayer.playMp4(fileName);
      }
    }
  }