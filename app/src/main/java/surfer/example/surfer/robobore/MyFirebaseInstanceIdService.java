package surfer.example.surfer.robobore;

import android.util.Log;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {

    private static final String REG_TOKEN="REG_TOKEN";
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        String recent_token=FirebaseInstanceId.getInstance().getToken();
        Log.d(REG_TOKEN,recent_token);
//        Toast.makeText(MyFirebaseInstanceIdService.this, recent_token, Toast.LENGTH_SHORT).show();
    }
}
