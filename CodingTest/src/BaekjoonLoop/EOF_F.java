package BaekjoonLoop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class EOF_F {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			StringTokenizer st;
			String line = "";

			while ((line = br.readLine()) != null) {

				st = new StringTokenizer(line);

				if (st.hasMoreTokens()) {

					bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
				} else {
					break;
				}
			}
			br.close();
			bw.flush();
			bw.close();

		} catch (

		Exception e) {
			e.printStackTrace();
		}
	}

}

/*
 * try-catch 블록과 throws 키워드는 모두 예외 처리에 사용되지만, 사용 방법과 목적이 다릅니다.
 * 
 * try-catch 블록: 예외가 발생할 수 있는 코드를 감싸고, 예외가 발생하면 해당 예외를 처리하는 데 사용됩니다. try 블록 내에서
 * 예외가 발생하면 해당 예외를 캐치하는 catch 블록으로 제어가 전달됩니다. catch 블록은 예외를 처리하고, 필요한 경우에는 예외에
 * 대한 추가 작업을 수행할 수 있습니다. finally 블록은 예외 발생 여부와 상관없이 항상 실행되며, 주로 리소스를 정리하는 데
 * 사용됩니다. java Copy code try { // 예외가 발생할 수 있는 코드 } catch (FileNotFoundException
 * e) { // FileNotFoundException 예외 처리 e.printStackTrace(); } catch (IOException
 * e) { // IOException 예외 처리 e.printStackTrace(); } finally { // 리소스 정리 try { if
 * (br != null) br.close(); } catch (IOException e) { e.printStackTrace(); } }
 * throws 키워드: 메서드 선언부에 사용되며, 해당 메서드가 특정 예외를 던질 수 있다는 것을 나타냅니다. 메서드를 호출한 곳에서 예외를
 * 처리하도록 요구합니다. 즉, 메서드 내에서 예외를 처리하지 않고 외부로 던집니다. 여러 예외를 throws할 수 있으며, 쉼표로 구분하여
 * 나열합니다. java Copy code public void readFile(String fileName) throws
 * FileNotFoundException, IOException { // 파일을 읽는 코드 BufferedReader br = new
 * BufferedReader(new FileReader(fileName)); // 예외 발생 시 메서드 외부로 던짐 } 따라서,
 * try-catch 블록은 예외를 처리하고 문제를 해결하는 데 사용되며, throws 키워드는 메서드 호출자에게 예외 처리 책임을 넘기는 데
 * 사용됩니다.
 * 
 * User e.printStackTrace(); 는 무슨뜻이야? ChatGPT e.printStackTrace()는 Java에서 예외를
 * 추적하는 데 사용되는 메서드입니다. 이 메서드는 예외가 발생한 위치부터 호출 스택(call stack)의 맨 위까지의 상세한 정보를
 * 출력합니다. 이 정보에는 예외 발생 위치, 예외 종류, 예외 메시지, 예외가 발생한 메서드 호출 스택 등이 포함될 수 있습니다.
 * 
 * 주로 개발 및 디버깅 과정에서 사용되며, 예외가 발생한 경우 어디서 예외가 발생했는지, 그리고 그 이유를 파악하는 데 도움을 줍니다.
 * 예외가 발생한 경우 해당 예외가 어떻게 처리되었는지 추적하여 디버깅하는 데 유용합니다.
 * 
 * 예를 들어, 다음과 같은 코드에서 예외가 발생했다고 가정해 보겠습니다.
 * 
 * java Copy code try { // 예외가 발생할 수 있는 코드 } catch (IOException e) { //
 * IOException 예외 처리 e.printStackTrace(); } 위의 코드에서 e.printStackTrace()는
 * IOException 예외가 발생했을 때 해당 예외를 출력합니다. 출력된 정보에는 예외가 발생한 위치와 예외 메시지가 포함되어 있어서,
 * 개발자가 이를 통해 문제를 해결할 수 있습니다.
 */
