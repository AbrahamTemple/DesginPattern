package flyweight.demo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.21
 * @GitHub https://github.com/AbrahamTemple/
 * @description: 地图单元格工厂
 */
public class MapCellFactory {

    private static Map<String,MapCell> map = new ConcurrentHashMap<>();//保证线程安全

    public static MapCell getMapCell(String name,String data){

        if(map.containsKey(name)){
            return map.get(name);
        }

        MapCell cell = new MapCell(name, data);

        map.put(name,cell);

        return cell;
    }

    public static int getFlyweightSize(){
        return map.size();
    }
}
