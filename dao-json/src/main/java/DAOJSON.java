import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;

public class DAOJSON {
    File file;
    ObjectMapper mapper;
    public DAOJSON(String filepath) {
        this.file = new File (filepath);
        this.mapper= new ObjectMapper();

    }
    public Collection<Kocsi> readAllKocsi (){
        Collection<Kocsi> result =new ArrayList<>();
        result = mapper.readValue(file, new TypeReferenc<ArrayList<Kocsi>>() {
        });
        return result;
    }
}
