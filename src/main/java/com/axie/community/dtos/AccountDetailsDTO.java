package com.axie.community.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@Data @AllArgsConstructor @NoArgsConstructor
public class AccountDetailsDTO {
    private Long id;
    private Boolean success;
    private String client_id;
    private Long total;
    private Long claimable_total;
    private Date last_claimed_item_at;
    private Date next_claim_at;
    private Long playerId;
    private Long playerName;
    private Float averageDaily;

    public void setLast_claimed_item_at(Long last_claimed_item_at) {
        this.last_claimed_item_at = convertDate(last_claimed_item_at);
        this.next_claim_at = new Date(this.last_claimed_item_at.getTime() + TimeUnit.DAYS.toMillis(14));
    }

    public Date convertDate(Long date) {
        return new Date(date*1000);
    }
}
