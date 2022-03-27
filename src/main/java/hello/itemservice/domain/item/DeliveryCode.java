package hello.itemservice.domain.item;

import lombok.AllArgsConstructor;
import lombok.Data;


/*
    FAST: 빠른 배송
    NORMAL: 일반 배송
    SLOW: 느린 배송
 */
@Data
@AllArgsConstructor
public class DeliveryCode {

    private String code; //FAST 같은 시스템에게 전달 하는 문자열
    private String displayName; //빠른배송 같은 클라이언트에게 보여주는 문자열
}
