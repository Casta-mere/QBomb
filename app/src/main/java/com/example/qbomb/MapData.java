package com.example.qbomb;

import java.util.ArrayList;

public class MapData {
    ArrayList<int [] []> mapDataList = new ArrayList<>();

    public MapData(){
        int [] [] mapData1 = {
                {1,1,1,1,1,1,1,1,1,1},
                {1,2,0,0,0,0,0,0,0,1},
                {1,0,1,0,1,0,1,1,0,1},
                {1,0,1,0,1,0,0,0,0,1},
                {1,0,1,0,1,1,1,1,0,1},
                {1,0,1,0,0,0,0,1,0,1},
                {1,0,1,1,1,1,0,1,0,1},
                {1,0,0,0,0,0,0,1,0,1},
                {1,0,1,1,1,1,1,1,0,1},
                {1,0,0,0,0,0,0,0,0,1},
                {1,1,1,1,1,1,1,1,1,1}
        };
        int [ ] [ ] mapData2 = {
                {1,1,1,1,1,1,1,1,1,1},
                {1,2,0,0,0,0,0,0,0,1},
                {1,0,1,1,1,1,1,1,0,1},
                {1,0,1,0,0,0,0,1,0,1},
                {1,0,1,0,1,1,0,1,0,1},
                {1,0,1,0,1,0,0,1,0,1},
                {1,0,1,0,1,1,1,1,0,1},
                {1,0,1,0,0,0,0,0,0,1},
                {1,0,1,1,1,1,1,1,0,1},
                {1,0,0,0,0,0,0,0,0,1},
                {1,1,1,1,1,1,1,1,1,1}
        };
        mapDataList.add(mapData1);
        mapDataList.add(mapData2);
    }
}
