package pl.hansonq.bank.models.forms;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lukasz on 2017-10-07.
 */
@Data


public class RequestForm {
    private int monthCash;
    private int minusCash;
    private int creditTime;
    private int creditCash;

}
