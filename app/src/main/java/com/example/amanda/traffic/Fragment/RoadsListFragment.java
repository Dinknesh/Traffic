package com.example.amanda.traffic.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.amanda.traffic.Adapter.ArrayAdapterRoads;
import com.example.amanda.traffic.Fragment2.FragmentStepActivity;
import com.example.amanda.traffic.Fragment2.StepListFragment;
import com.example.amanda.traffic.Models.Roads;
import com.example.amanda.traffic.R;

import java.util.ArrayList;

public class RoadsListFragment extends Fragment {

    ArrayAdapterRoads arrayAdapterRoads;
    ArrayList<Roads> aRoads;
    ListView mainListView;
/*
    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;

    String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars",
            "Jupiter", "Saturn", "Uranus", "Neptune"};
*/


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_roads_list, container, false);

        mainListView = (ListView) v.findViewById(R.id.lvRoads);

        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                startActivity(new Intent(getActivity(), FragmentStepActivity.class));


              /*  StepListFragment cv = new StepListFragment();
                FragmentManager fm= getFragmentManager();
                FragmentTransaction ft= fm.beginTransaction();
                ft.replace(R.id.custom_view, cv);
                ft.commit();*/
            }
        });

        aRoads = new ArrayList<>();
        arrayAdapterRoads = new ArrayAdapterRoads(getActivity(), aRoads);
        mainListView.setAdapter(arrayAdapterRoads);

        arrayAdapterRoads.addAll(Roads.fromFakeData());
        arrayAdapterRoads.notifyDataSetChanged();

      /*  // Find the ListView resource.
        mainListView = (ListView) v.findViewById(R.id.lvRoads);
        ImageView imageView = v.findViewById(R.id.ivRoads);
        TextView itext = v.findViewById(R.id.tvRoads);



        // Create and populate a List of planet names.
        ArrayList<String> planetList = new ArrayList<String>();
        planetList.addAll( Arrays.asList(planets) );

        // Create ArrayAdapter using the planet list.
        listAdapter = new ArrayAdapter<String>(getActivity(), R.layout.roads_list_item, planetList);

        // Add more planets. If you passed a String[] instead of a List<String>
        // into the ArrayAdapter constructor, you must not add more items.
        // Otherwise an exception will occur.
        listAdapter.add( "Ceres" );
        listAdapter.add( "Pluto" );
        listAdapter.add( "Haumea" );
        listAdapter.add( "Makemake" );
        listAdapter.add( "Eris" );

        // Set the ArrayAdapter as the ListView's adapter.
        mainListView.setAdapter( listAdapter );*/
        return v;
    }


}
