package audreyhu.donedone.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import audreyhu.donedone.R;
import audreyhu.donedone.data.Note_Content;
import audreyhu.donedone.managers.SolventViewHolders;

public class NotesSolventRecyclerViewAdapter extends RecyclerView.Adapter<SolventViewHolders>{

    //TODO change object to valid type
    private List<Note_Content> noteList;
    private Context context;


    public NotesSolventRecyclerViewAdapter(Context context, List<Note_Content> noteList){
        this.context = context;
        this.noteList = noteList;
    }

    //@NonNull
    @Override
    public SolventViewHolders onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View layoutView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.solvent_note, null);
        SolventViewHolders rcv = new SolventViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(@NonNull SolventViewHolders solventViewHolders, int position) {
        solventViewHolders.note_title.setText(noteList.get(position).ntitle);
        solventViewHolders.note_overview.setText(noteList.get(position).nOverview);
    }

    @Override
    public int getItemCount() {
        return this.noteList.size();
    }
}
