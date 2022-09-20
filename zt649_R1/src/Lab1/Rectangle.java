package Lab1;

public class Rectangle {
    private int m_length;
    private int m_width;

    public Rectangle(){
        m_length = 1;
        m_width = 1;
    }

    public Rectangle(int _l, int _w){
        m_length = _l;
        m_width = _w;
    }

    public void printArea(){
        int _area = m_length * m_width;
        System.out.println(_area);
    }

    public void printAreaTenTimes(){
        int _areaTenTimes = m_length * m_width * 10;
        System.out.println(_areaTenTimes);
    }

    public boolean IsSquare(){
        boolean _isSquare = false;
        if (m_length == m_width){
            _isSquare = true;
        }
        return _isSquare;
    }
}
