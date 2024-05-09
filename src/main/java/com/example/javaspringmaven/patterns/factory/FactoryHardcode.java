package com.example.javaspringmaven.patterns.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.google.common.collect.ImmutableMap;

@Service
@Scope("prototype")
public class FactoryHardcode {

    @Autowired
    private ObjectType1 type1;
    @Autowired
    private ObjectType2 type2;

    private ImmutableMap<String, ObjetInterface> myInterfaceMap;

    @PostConstruct
    public void setUp(){
        myInterfaceMap = ImmutableMap.<String, ObjetInterface>builder()
        .put("ID1",type1)
        .put("ID2",type2)
        .build();
    }

    public ObjetInterface getObjectTypePostConstruct(String id){
       return myInterfaceMap.get(id);
    }

    public ObjetInterface getObjectTypeSimple(String id){
        Map<String,ObjetInterface> map = new HashMap<>();
        map.put("ID1", type1);
        map.put("ID2", type2);
        return map.get(id);

    }
}
