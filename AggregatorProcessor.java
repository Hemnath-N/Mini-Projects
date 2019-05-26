package aggregators;

import java.io.IOException;
import java.util.List;

import fileprocessors.StockFileReader;

public class AggregatorProcessor<T extends Aggregator> {

	public String filePath;
	T agg;
	
	public AggregatorProcessor(T agg, String filePath) {
		this.agg = agg;
		this.filePath = filePath;
	}
	
	public double runAggregator(int colIndx) throws IOException {
		
		StockFileReader stockFileReader = new StockFileReader(filePath);
		List<String> values = stockFileReader.readFileData();
		
		for(String lines : values) {
			String[] numbers = lines.split(",");
			double dVal = Double.parseDouble(numbers[colIndx]);
			agg.add(dVal);
		}
		
		double number = agg.calculate();
		return number;
		
	}
	
	
}
