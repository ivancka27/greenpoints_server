package com.samsung.greenpoints;

import com.samsung.greenpoints.domain.Place;
import com.samsung.greenpoints.rest.controller.PlaceController;
import com.samsung.greenpoints.rest.dto.PlaceDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreenpointsApplication {

	public static void main(String[] args) {


		Place place1 = new Place(
				0L,
				"Пункт переработки \"Эко-Москва\"",
				"https://example.com/images/eco_moscow.jpg",
				"ул. Тверская, д. 12",
				0.0,
				"Современный пункт приёма пластика и бумаги",
				0,
				55.787857,
				37.732278
		);

		Place place2 = new Place(
				0L,
				"Центр переработки \"Чистый город\"",
				"https://example.com/images/chisty_gorod.jpg",
				"ул. Ленина, д. 45",
				0.0,
				"Принимаем стекло, металл и пластик",
				0,
				55.763,
				37.622
		);

		Place place3 = new Place(
				0L,
				"Пункт \"Зелёный мир\"",
				"https://example.com/images/zeleny_mir.jpg",
				"просп. Мира, д. 101",
				0.0,
				"Экологически чистый центр переработки",
				0,
				55.780,
				37.635
		);

		Place place4 = new Place(
				0L,
				"Экоцентр \"Вторсырьё\"",
				"https://example.com/images/vtorsyrje.jpg",
				"ул. Арбат, д. 23",
				0.0,
				"Принимаем бумагу, пластик, металл",
				0,
				55.752,
				37.598
		);

		Place place5 = new Place(
				0L,
				"Пункт \"Чистая планета\"",
				"https://example.com/images/chistaya_planeta.jpg",
				"ул. Пушкина, д. 10",
				0.0,
				"Удобное расположение, дружелюбный персонал",
				0,
				55.745,
				37.610
		);

		Place place6 = new Place(
				0L,
				"Центр \"ЭкоЛайн\"",
				"https://example.com/images/ekolain.jpg",
				"ул. Садовая, д. 5",
				0.0,
				"Принимаем бытовые отходы для переработки",
				0,
				55.760,
				37.620
		);

		Place place7 = new Place(
				0L,
				"Пункт \"Вторичное сырьё\"",
				"https://example.com/images/vtorichnoe_syrje.jpg",
				"ул. Новая, д. 15",
				0.0,
				"Принимаем пластик, бумагу и металл",
				0,
				55.770,
				37.625
		);

		Place place8 = new Place(
				0L,
				"Экоцентр \"Зелёный город\"",
				"https://example.com/images/zeleny_gorod.jpg",
				"ул. Цветочная, д. 8",
				0.0,
				"Современное оборудование, удобный график",
				0,
				55.755,
				37.630
		);

		Place place9 = new Place(
				0L,
				"Пункт \"Чистый дом\"",
				"https://example.com/images/chisty_dom.jpg",
				"ул. Лесная, д. 20",
				0.0,
				"Принимаем электронику и бытовую технику",
				0,
				55.765,
				37.640
		);

		Place place10 = new Place(
				0L,
				"Центр \"ЭкоТех\"",
				"https://example.com/images/ekoteh.jpg",
				"ул. Советская, д. 11",
				0.0,
				"Принимаем металл, пластик, бумагу",
				0,
				55.758,
				37.618
		);

		Place place11 = new Place(
				0L,
				"Пункт \"Зелёный путь\"",
				"https://example.com/images/zeleny_put.jpg",
				"ул. Большая Никитская, д. 7",
				0.0,
				"Принимаем бытовые отходы и вторсырьё",
				0,
				55.752,
				37.605
		);

		Place place12 = new Place(
				0L,
				"Центр переработки \"Ресайкл\"",
				"https://example.com/images/resaykl.jpg",
				"ул. Таганская, д. 3",
				0.0,
				"Принимаем пластик, бумагу, металл",
				0,
				55.740,
				37.620
		);

		Place place13 = new Place(
				0L,
				"Пункт \"ЭкоДом\"",
				"https://example.com/images/ekodom.jpg",
				"ул. Кузнецкий Мост, д. 12",
				0.0,
				"Удобное расположение, прием электроники",
				0,
				55.760,
				37.615
		);

		Place place14 = new Place(
				0L,
				"Экоцентр \"Чистая среда\"",
				"https://example.com/images/chistaya_sreda.jpg",
				"ул. Ленинская, д. 18",
				0.0,
				"Принимаем бумагу, пластик, металл",
				0,
				55.755,
				37.600
		);

		Place place15 = new Place(
				0L,
				"Пункт \"Вторсырьё Плюс\"",
				"https://example.com/images/vtorsyrje_plus.jpg",
				"ул. Новослободская, д. 9",
				0.0,
				"Современное оборудование, удобный график",
				0,
				55.770,
				37.620
		);

		Place place16 = new Place(
				0L,
				"Центр \"ЭкоЛогика\"",
				"https://example.com/images/ekologika.jpg",
				"ул. Дмитровка, д. 14",
				0.0,
				"Принимаем бытовые отходы и электронику",
				0,
				55.765,
				37.610
		);

		Place place17 = new Place(
				0L,
				"Пункт \"Чистый город\"",
				"https://example.com/images/chisty_gorod.jpg",
				"ул. Сретенка, д. 6",
				0.0,
				"Принимаем пластик, бумагу, металл",
				0,
				55.758,
				37.620
		);

		Place place18 = new Place(
				0L,
				"Экоцентр \"Вторсырьё-М\"",
				"https://example.com/images/vtorsyrje_m.jpg",
				"ул. Кузнецкий Мост, д. 5",
				0.0,
				"Принимаем бытовые отходы и электронику",
				0,
				55.760,
				37.610
		);

		Place place19 = new Place(
				0L,
				"Пункт \"Зелёная планета\"",
				"https://example.com/images/zelenaya_planeta.jpg",
				"ул. Большая Дмитровка, д. 20",
				0.0,
				"Принимаем пластик, бумагу, металл",
				0,
				55.770,
				37.630
		);

		Place place20 = new Place(
				0L,
				"Центр \"ЭкоПлюс\"",
				"https://example.com/images/ekoplus.jpg",
				"ул. Тверская, д. 25",
				0.0,
				"Современное оборудование, прием электроники",
				0,
				55.755,
				37.615
		);

		PlaceController controller = SpringApplication.run(
				GreenpointsApplication.class, args).getBean(PlaceController.class);
		controller.save(PlaceDto.PlaceToDto(place1));
		controller.save(PlaceDto.PlaceToDto(place2));
		controller.save(PlaceDto.PlaceToDto(place3));
		controller.save(PlaceDto.PlaceToDto(place4));
		controller.save(PlaceDto.PlaceToDto(place5));
		controller.save(PlaceDto.PlaceToDto(place6));
		controller.save(PlaceDto.PlaceToDto(place7));
		controller.save(PlaceDto.PlaceToDto(place8));
		controller.save(PlaceDto.PlaceToDto(place9));
		controller.save(PlaceDto.PlaceToDto(place10));
		controller.save(PlaceDto.PlaceToDto(place11));
		controller.save(PlaceDto.PlaceToDto(place12));
		controller.save(PlaceDto.PlaceToDto(place13));
		controller.save(PlaceDto.PlaceToDto(place14));
		controller.save(PlaceDto.PlaceToDto(place15));
		controller.save(PlaceDto.PlaceToDto(place16));
		controller.save(PlaceDto.PlaceToDto(place17));
		controller.save(PlaceDto.PlaceToDto(place18));
		controller.save(PlaceDto.PlaceToDto(place19));
		controller.save(PlaceDto.PlaceToDto(place20));
	}
}
