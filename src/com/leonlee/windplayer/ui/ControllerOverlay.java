/**
 * 
 */
package com.leonlee.windplayer.ui;

import android.view.View;

/**
 * @author liya
 *
 */
public interface ControllerOverlay {

    interface Listener {
        void onPlayPause();
        void onShown();
        void onHidden();
        void onReplay();
        
        void onStopVideo();
        void onNext();
        void onPrev();
        void onFfwd();
        void onRew();
        
        void onFavoriteVideo(boolean bFavorite);
        
        void onSeekStart();
        void onSeekMove(int time);
        void onSeekEnd(int time);
    }
    
    void setListener(Listener l);
    
    void setCanReplay(boolean canReplay);
    
    /**
     * @return The overlay view that should be added to the player.
     */
    View getView();

    void show();

    void showPlaying();

    void showPaused();

    void showEnded();

    void showLoading();

    void showErrorMessage(String message);
    
    void setTimes(int currentTime, int totalTime);
    
    void setControlButtonEnable(boolean enable);
    void setControlButtonEnableForStop(boolean enable);

    void clearPlayState();

    void showFfwdButton(boolean show);

    void showRewButton(boolean show);

    void setStopButton(boolean enable);

    void timeBarEnable(boolean enable);

    void setLiveMode();
}
