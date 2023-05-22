package com.inditex.technicalChallenge.model.dto;

import java.util.Date;
import java.util.Objects;

public class PrizeDto {

	private long prizeList;
	private long brandId;
	private Date startDate;
	private Date endDate;
	private long product;
	private String price;
	
	public PrizeDto() {
		super();
	}
	
	public PrizeDto(long prizeList, long brandId, Date startDate, Date endDate, long product, String price) {
		super();
		this.prizeList = prizeList;
		this.brandId = brandId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.product = product;
		this.price = price;
	}
	
	public PrizeDto(PrizeDto prizeDto) {
		super();
		this.prizeList = prizeDto.prizeList;
		this.brandId = prizeDto.brandId;
		this.startDate = prizeDto.startDate;
		this.endDate = prizeDto.endDate;
		this.product = prizeDto.product;
		this.price = prizeDto.price;
	}

	public long getPrizeList() {
		return prizeList;
	}

	public void setPrizeList(long prizeList) {
		this.prizeList = prizeList;
	}

	public long getBrandId() {
		return brandId;
	}

	public void setBrandId(long brandId) {
		this.brandId = brandId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public long getProduct() {
		return product;
	}

	public void setProduct(long product) {
		this.product = product;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brandId, endDate, price, prizeList, product, startDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrizeDto other = (PrizeDto) obj;
		return brandId == other.brandId && Objects.equals(endDate, other.endDate) && Objects.equals(price, other.price)
				&& prizeList == other.prizeList && product == other.product
				&& Objects.equals(startDate, other.startDate);
	}

	@Override
	public String toString() {
		return "PrizeDto [prizeList=" + prizeList + ", brandId=" + brandId + ", startDate=" + startDate + ", endDate="
				+ endDate + ", product=" + product + ", price=" + price + "]";
	}
}
