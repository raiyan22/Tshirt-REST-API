package com.springgrest.springgrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tshirts {
		@Id
		private long id;
		private String color;
		private String size;
		
		public Tshirts(long id, String color, String size) {
			super();
			this.id = id;
			this.color = color;
			this.size = size;
		}

		public Tshirts() {
			super();
			// TODO Auto-generated constructor stub
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		@Override
		public String toString() {
			return "Tshirts [id=" + id + ", color=" + color + ", size=" + size + "]";
		}

		public String getSize() {
			return size;
		}

		public void setSize(String size) {
			this.size = size;
		}
		
}
