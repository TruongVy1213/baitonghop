package Observer;

import java.util.ArrayList;
import java.util.List;

public class SocialNewFeed implements Observer{
    private List<String> statuses = new ArrayList<>();

    @Override
    public void update(String status) {
        statuses.add(status);
    }

    public void showFeed() {
        if (statuses.isEmpty()) {
            System.out.println("Feed trống");
        } else {
            for (String s : statuses) {
                System.out.println(s);
            }
        }
    }
}
