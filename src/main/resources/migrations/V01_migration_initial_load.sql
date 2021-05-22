INSERT INTO database.tb_product( name, description, image, price)
VALUES ('Notebook2', 'o notebook mais rapido', 'notebook.png', 2000.40);

INSERT INTO database.tb_product( name, description, image, price)
VALUES ('Notebook3', 'o notebook mais rapido', 'notebook.png', 2000.40);
	
INSERT INTO database.tb_product( name, description, image, price)
VALUES ('Notebook4', 'o notebook mais rapido', 'notebook.png', 2000.40);

INSERT INTO database.tb_showcase(product_id, due_date, active) 
VALUES (1, to_date('22/05/2021','dd/mm/yyyy') , true);

INSERT INTO database.tb_showcase(product_id, due_date, active) 
VALUES (2, to_date('22/05/2021','dd/mm/yyyy') , true);

INSERT INTO database.tb_showcase(product_id, due_date, active) 
VALUES (3, to_date('20/05/2021','dd/mm/yyyy') , true);

INSERT INTO database.tb_showcase(product_id, due_date, active) 
VALUES (4, to_date('20/05/2021','dd/mm/yyyy') , false);

select * from database.tb_product;
select * from database.tb_showcase;