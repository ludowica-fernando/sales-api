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