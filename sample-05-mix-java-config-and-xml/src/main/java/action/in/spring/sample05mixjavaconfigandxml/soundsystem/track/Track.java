package action.in.spring.sample05mixjavaconfigandxml.soundsystem.track;

public interface Track {

    default void play(){
        System.out.println("Playing " + this.getClass().getSimpleName());
    };

}
