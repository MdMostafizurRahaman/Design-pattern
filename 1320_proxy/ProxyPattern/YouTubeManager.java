package ProxyPattern;

class YouTubeManager {
    protected ThirdPartyYouTubeLib service;

    public YouTubeManager(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    public void renderVideoPage(String id) {
        service.getVideoInfo(id);
        // Render the video page.
    }

    public void renderListPanel() {
        service.listVideos();
        // Render the list of video thumbnails.
    }

    public void reactOnUserInput() {
        renderVideoPage("videoID");
        renderListPanel();
    }
}