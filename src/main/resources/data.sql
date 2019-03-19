INSERT INTO sales.customer(name, payment_flag, trading_name)
VALUES
  ('Tom Hardy', 'clear', ''),
  ('Shane Ward', 'clear', ''),
  ('', 'clear', 'ABC Company');

INSERT INTO sales.customer_contact(collection_location, delivery_location, email, main_location, telephone, customer_id)
VALUES
('124 Avenue', '124 Avenue', 'tomhardy123@gmail.com', '124 Avenue', 0774448963, 2),
('47/2 Sea Street', '47/2 Sea Street', 'abcprivate@gmail.com', '47/2 Sea Street', 0112247856, 3),
('67 Avenue', '67 Avenue', 'maheshperera@gmail.com', '12 Cross Rd', 0777848963, 4);

INSERT INTO sales.orders(customer_name, due_date, mode_of_shipment, price, qty)
VALUES
  ('Tom Hardy', '05-06-2019', 'post', 4500.00, 5),
  ('John Doe', '25-10-2019', 'post', 15000.00, 3),
  ('XYZ Pvt Ltd', '15-05-2019', 'pick-up', 60000.00, 10);

INSERT INTO sales.order_status(order_status, production_status, warehouse_status, orders_id)
VALUES
  ('complete', 'complete', 'complete', 1),
  ('incomplete', 'incomplete', 'incomplete', 2),
  ('complete', 'complete', 'complete', 3);





