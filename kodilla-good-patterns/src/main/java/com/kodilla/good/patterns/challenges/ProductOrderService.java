package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private SalesService salesService;
    private SalesRepository salesRepository;

    public ProductOrderService(final InformationService informationService, final SalesService salesService, final SalesRepository salesRepository) {
        this.informationService = informationService;
        this.salesService = salesService;
        this.salesRepository = salesRepository;
    }

    public void process(final Order order) {

        boolean isBought = salesService.sale(order.getUser(), order.getDateOfSale(), order.getProduct());

        if (isBought) {
            informationService.inform(order.getUser(), order.getProduct(), order.getDateOfSale(), isBought);
            salesRepository.createSaleProduct(order.getUser(), order.getProduct(), order.getDateOfSale());
        } else {
            informationService.inform(order.getUser(), order.getProduct(), order.getDateOfSale(), isBought);
        }
    }
}
