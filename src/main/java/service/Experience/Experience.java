package service.Experience;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter @Setter @RequiredArgsConstructor
public class Experience {

    private Date startDate;
    private Date endDate;
    private String description;

    public Experience(Date startDate, String description) {
        this.startDate = startDate;
        this.endDate = null;
        this.description = description;
    }


}
