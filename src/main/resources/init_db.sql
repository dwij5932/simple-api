create schema if not exists master_data;

create table if not exists master_data.customer_detail
(
    customer_id     varchar(20) not null,
    customer_name    varchar(50) not null,
    email       varchar(50) not null,
    telephone       varchar(20) not null,
    address       varchar(100) not null,
    primary key (customer_id)
);

create table if not exists master_data.enterprise_detail
(
    customer_id     varchar(20) not null,
    enterprise_name    varchar(50) not null,
    email       varchar(50) not null,
    telephone       varchar(20) not null,
    address       varchar(100) not null,
    primary key (customer_id)
);

-- Insert data into customer_detail table
insert into master_data.customer_detail (
    customer_id, customer_name, email, telephone, address
) values
    ('CUST001', 'John Doe', 'john.doe@example.com', '555-1234', '123 Elm Street, Springfield'),
    ('CUST002', 'Jane Smith', 'jane.smith@example.com', '555-5678', '456 Oak Avenue, Shelbyville'),
    ('CUST003', 'Alice Johnson', 'alice.johnson@example.com', '555-8765', '789 Pine Road, Capital City'),
    ('CUST004', 'Bob Brown', 'bob.brown@example.com', '555-4321', '101 Maple Lane, Springfield');

-- Insert data into enterprise_detail table
insert into master_data.enterprise_detail (
    customer_id, enterprise_name, email, telephone, address
) values
    ('CUST001', 'Doe Enterprises', 'contact@doeenterprises.com', '555-1122', '500 Business Blvd, Springfield'),
    ('CUST002', 'Smith Solutions', 'info@smithsolutions.com', '555-3344', '600 Commerce Street, Shelbyville'),
    ('CUST003', 'Johnson Innovations', 'support@johnsoninnovations.com', '555-5566', '700 Industry Park, Capital City'),
    ('CUST004', 'Brown LLC', 'sales@brownllc.com', '555-7788', '800 Corporate Drive, Springfield');

