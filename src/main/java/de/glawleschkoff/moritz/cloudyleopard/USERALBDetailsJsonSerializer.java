package de.glawleschkoff.moritz.cloudyleopard;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import de.glawleschkoff.moritz.cloudyleopard.model.USERALBDetailsModel;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

//@JsonComponent
public class USERALBDetailsJsonSerializer extends JsonSerializer<USERALBDetailsModel> {

    @Override
    public void serialize(USERALBDetailsModel model, JsonGenerator jsonGenerator,
                          SerializerProvider serializerProvider) throws IOException,
            JsonProcessingException {

        //jsonGenerator.writeStartObject();
        jsonGenerator.writeObject(model);


        //jsonGenerator.writeEndObject();
    }
}
