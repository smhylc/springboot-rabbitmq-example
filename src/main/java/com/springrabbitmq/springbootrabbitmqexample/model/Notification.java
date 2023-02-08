package com.springrabbitmq.springbootrabbitmqexample.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Semih Yolcu
 * Created on 8.02.2023
 */

@Getter
@Setter
@ToString
@Builder
public class Notification implements Serializable {

	private String notificationId;
	private Date createdAt;
	private Boolean seen;
	private String message;

}
