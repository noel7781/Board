import List from '@mui/material/List';
import { Stack, Divider } from '@mui/material';
import Tr from './Tr';
const contents = [
  {
    id: 10,
    title: 'Hello World',
    author: '김철수',
    createdAt: '2019-05-01',
    updatedAt: '2019-05-01',
    views: 10,
    likes: 10,
  },
  {
    id: 210,
    title: 'Hello World2',
    author: '이기자',
    createdAt: '2019-05-02',
    updatedAt: '2019-05-02',
    views: 20,
    likes: 100,
  },
];
const Board = ({ kind }) => {
  return (
    <div className='container max-w-screen-lg mx-auto'>
      <div className='text-xl font-bold mt-5 mb-3 text-center'>글 리스트</div>
      <table className='min-w-full table-auto text-gray-800'>
        <thead className='justify-between'>
          <tr className='bg-gray-800'>
            <th className='text-gray-300 px-4 py-3'>번호</th>
            <th className='text-gray-300 px-4 py-3'>제목</th>
            <th className='text-gray-300 px-4 py-3'>글쓴이</th>
            <th className='text-gray-300 px-4 py-3'>작성일</th>
            <th className='text-gray-300 px-4 py-3'>조회수</th>
            <th className='text-gray-300 px-4 py-3'>좋아요</th>
          </tr>
        </thead>
        <Tr contents={contents} />
      </table>
    </div>
  );
};

export default Board;
