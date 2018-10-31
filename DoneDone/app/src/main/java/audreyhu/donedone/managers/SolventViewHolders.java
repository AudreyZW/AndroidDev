package audreyhu.donedone.managers;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import audreyhu.donedone.R;

public class SolventViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView note_title;
    public TextView note_overview;

    public SolventViewHolders(@NonNull View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        note_title = itemView.findViewById(R.id.list_note_title);
        note_overview = itemView.findViewById(R.id.list_note_overview);
    }

    @Override
    public void onClick(View v) {
        //TODO
        // not sure if getlayoutposition or getadapaterposition
        Toast.makeText(v.getContext(), "Clicked Position = "+ getLayoutPosition(), Toast.LENGTH_SHORT).show();
    }
}
