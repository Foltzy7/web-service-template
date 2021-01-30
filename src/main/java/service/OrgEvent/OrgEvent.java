package service.OrgEvent;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter @Setter @RequiredArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrgEvent {

    String name;
    String location;
    private String description;
    @JsonFormat(pattern="MM-dd-yyyy")
    private Date startDate;
    @JsonFormat(pattern="MM-dd-yyyy")
    private Date endDate;

    public OrgEvent(String name, String location, String description) {
        this.name = name;
        this.location = location;
        this.description = description;
        this.startDate = null;
        this.endDate = null;
    }


}
