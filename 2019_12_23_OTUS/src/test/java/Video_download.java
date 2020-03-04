import java.io.File;
import java.net.URL;
import com.github.axet.vget.VGet;

public class Video_download {
    public static void main(String[] args) {
        try {
            String url = "//storage.googleapis.com/media-session/caminandes/short.mp4#t=80";
            String path = "~/Desktop/PROJECTS/OTUS/otus_git/2019_12_23_OTUS";
            VGet v = new VGet(new URL(url), new File(path));
            v.download();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
