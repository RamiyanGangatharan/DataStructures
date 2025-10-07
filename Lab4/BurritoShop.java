public class BurritoShop {

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(int transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public Queue getOrder() {
        return order;
    }

    public void setOrder(Queue order) {
        this.order = order;
    }

    public Stack getDishpit() {
        return dishpit;
    }

    public void setDishpit(Stack dishpit) {
        this.dishpit = dishpit;
    }

    public Queue getTransactions() {
        return transactions;
    }

    public void setTransactions(Queue transactions) {
        this.transactions = transactions;
    }

    public int orderNumber;
    public int transactionNumber;
    public Queue order = new Queue();
    public Stack dishpit = new Stack();
    public Queue transactions = new Queue();

    public BurritoShop() {
        this.orderNumber = 0;
        this.transactionNumber = 0;
        this.order = new Queue();
        this.dishpit = new Stack();
        this.transactions = new Queue();
    }

    public String ordercounter() {
        return Integer.toString(orderNumber);
    }

    public String transactioncounter() {
        return Integer.toString(transactionNumber);
    }

    public void takeOrder(Burrito burrito)
    {
        order.enqueue(burrito);
        orderNumber++;
        dishpit.push("dirtyPlate");
    }

    public void makeOrder()
    {
        if (order.isEmpty()) {System.out.println("No orders, take more orders!");}
        else {
            transactions.enqueue(order.dequeue());
            dishpit.push("Spoon");
            transactionNumber++;
            orderNumber--;
        }
    }

    public void getNextTransaction()
    {
        if (transactions.isEmpty()) {
            System.out.println("No more transactions, make more orders!");
        }
        else {
            Burrito burrito = (Burrito) transactions.dequeue();
            System.out.println("Cost of Burrito: " + burrito.getCost());
            transactionNumber--;
        }
    }

    public void washDish()
    {
        String dish = (String) dishpit.pop();
        System.out.println("a " + dish + "has been washed!");
    }

    public void washAllDishes()
    {
        System.out.println("The following dishes have been washed: ");
        while (isDishInSink()) {
            System.out.println(dishpit.pop());
        }
    }

    public Boolean isDishInSink(){
        return dishpit.isEmpty();
    }
}
