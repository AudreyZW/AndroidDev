package audreyhu.donedone.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import audreyhu.donedone.R;
import audreyhu.donedone.adapters.NotesSolventRecyclerViewAdapter;
import audreyhu.donedone.data.Note_Content;
import audreyhu.donedone.data.Notes_Data_Generation;


public class NoteFragment extends Fragment {



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.note_main, container, false);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);


        RecyclerView rcv = view.findViewById(R.id.note_list);
        rcv.setHasFixedSize(true);
        rcv.setLayoutManager(staggeredGridLayoutManager);

        List<Note_Content> note_contentList = new Notes_Data_Generation().getData();

        NotesSolventRecyclerViewAdapter rvAdapter = new NotesSolventRecyclerViewAdapter(getContext(),note_contentList);
        rcv.setAdapter(rvAdapter);

        return view;

    }

}
