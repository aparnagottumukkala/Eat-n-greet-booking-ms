package com.nus.iss.eatngreet.booking.responsedto;

import java.util.Date;
import java.util.Set;

import com.nus.iss.eatngreet.booking.entity.ItemEntity;

import lombok.Data;
/*added comment just to trigger build*/
@Data
public class ConsumerOrderResponseDto {
	private Long consumerId;
	private Set<ItemEntity> itemList;
	private Date servingDate;
	private Date paymentDeadline;
	private Long price;
}
